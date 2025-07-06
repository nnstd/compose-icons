package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BeakerMinus: ImageVector
    get() {
        if (_BeakerMinus != null) {
            return _BeakerMinus!!
        }
        _BeakerMinus = ImageVector.Builder(
            name = "BeakerMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(23f)
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                curveTo(19.9f, 5f, 19f, 5.9f, 19f, 7f)
                verticalLineTo(12f)
                curveTo(15.69f, 12f, 13f, 14.69f, 13f, 18f)
                curveTo(13f, 19.09f, 13.29f, 20.12f, 13.8f, 21f)
                horizontalLineTo(7f)
                curveTo(5.9f, 21f, 5f, 20.1f, 5f, 19f)
                verticalLineTo(7f)
                curveTo(5f, 5.9f, 4.1f, 5f, 3f, 5f)
                verticalLineTo(3f)
                moveTo(7f, 9f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                moveTo(7f, 11f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                moveTo(10f, 16f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                moveTo(12f, 14f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                moveTo(12f, 8f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _BeakerMinus!!
    }

@Suppress("ObjectPropertyName")
private var _BeakerMinus: ImageVector? = null

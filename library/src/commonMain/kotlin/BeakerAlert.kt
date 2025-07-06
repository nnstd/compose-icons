package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BeakerAlert: ImageVector
    get() {
        if (_BeakerAlert != null) {
            return _BeakerAlert!!
        }
        _BeakerAlert = ImageVector.Builder(
            name = "BeakerAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                curveTo(19.9f, 5f, 19f, 5.9f, 19f, 7f)
                verticalLineTo(19f)
                curveTo(19f, 20.1f, 18.1f, 21f, 17f, 21f)
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
                moveTo(21f, 13f)
                verticalLineTo(7f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                moveTo(21f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(23f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _BeakerAlert!!
    }

@Suppress("ObjectPropertyName")
private var _BeakerAlert: ImageVector? = null

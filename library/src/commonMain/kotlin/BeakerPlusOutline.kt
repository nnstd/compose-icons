package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BeakerPlusOutline: ImageVector
    get() {
        if (_BeakerPlusOutline != null) {
            return _BeakerPlusOutline!!
        }
        _BeakerPlusOutline = ImageVector.Builder(
            name = "BeakerPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 14f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                horizontalLineTo(23f)
                verticalLineTo(19f)
                horizontalLineTo(20f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                curveTo(19.9f, 5f, 19f, 5.9f, 19f, 7f)
                verticalLineTo(12f)
                curveTo(18.3f, 12f, 17.63f, 12.12f, 17f, 12.34f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                horizontalLineTo(13.08f)
                curveTo(13.2f, 19.72f, 13.45f, 20.39f, 13.8f, 21f)
                horizontalLineTo(7f)
                curveTo(5.9f, 21f, 5f, 20.11f, 5f, 19f)
                verticalLineTo(7f)
                curveTo(5f, 5.9f, 4.11f, 5f, 3f, 5f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _BeakerPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BeakerPlusOutline: ImageVector? = null

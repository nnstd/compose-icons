package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldPlusOutline: ImageVector
    get() {
        if (_ShieldPlusOutline != null) {
            return _ShieldPlusOutline!!
        }
        _ShieldPlusOutline = ImageVector.Builder(
            name = "ShieldPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 20f)
                verticalLineTo(22.97f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(19f)
                moveTo(21f, 11f)
                curveTo(21f, 11.9f, 20.9f, 12.78f, 20.71f, 13.65f)
                curveTo(20.13f, 13.35f, 19.5f, 13.15f, 18.81f, 13.05f)
                curveTo(18.93f, 12.45f, 19f, 11.83f, 19f, 11.22f)
                verticalLineTo(6.3f)
                lineTo(12f, 3.18f)
                lineTo(5f, 6.3f)
                verticalLineTo(11.22f)
                curveTo(5f, 15.54f, 8.25f, 20f, 12f, 21f)
                lineTo(12.31f, 20.91f)
                curveTo(12.5f, 21.53f, 12.83f, 22.11f, 13.22f, 22.62f)
                lineTo(12f, 23f)
                curveTo(6.84f, 21.74f, 3f, 16.55f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(21f, 5f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _ShieldPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldPlusOutline: ImageVector? = null

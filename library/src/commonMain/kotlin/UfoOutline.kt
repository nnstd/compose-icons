package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.UfoOutline: ImageVector
    get() {
        if (_UfoOutline != null) {
            return _UfoOutline!!
        }
        _UfoOutline = ImageVector.Builder(
            name = "UfoOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10.54f)
                curveTo(16.78f, 7.44f, 14.63f, 5f, 12f, 5f)
                reflectiveCurveTo(7.22f, 7.44f, 7f, 10.54f)
                curveTo(4f, 11.23f, 2f, 12.5f, 2f, 14f)
                curveTo(2f, 16.21f, 6.5f, 18f, 12f, 18f)
                reflectiveCurveTo(22f, 16.21f, 22f, 14f)
                curveTo(22f, 12.5f, 20f, 11.23f, 17f, 10.54f)
                moveTo(14.93f, 11.84f)
                curveTo(13.03f, 12.05f, 10.97f, 12.05f, 9.07f, 11.84f)
                curveTo(9.03f, 11.56f, 9f, 11.28f, 9f, 11f)
                curveTo(9f, 8.8f, 10.35f, 7f, 12f, 7f)
                reflectiveCurveTo(15f, 8.8f, 15f, 11f)
                curveTo(15f, 11.28f, 15f, 11.56f, 14.93f, 11.84f)
                close()
            }
        }.build()

        return _UfoOutline!!
    }

@Suppress("ObjectPropertyName")
private var _UfoOutline: ImageVector? = null

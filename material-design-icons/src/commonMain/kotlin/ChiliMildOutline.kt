package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ChiliMildOutline: ImageVector
    get() {
        if (_ChiliMildOutline != null) {
            return _ChiliMildOutline!!
        }
        _ChiliMildOutline = ImageVector.Builder(
            name = "ChiliMildOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.25f, 7.5f)
                lineTo(8.73f, 6.63f)
                curveTo(9.26f, 5.7f, 10.03f, 5f, 10.94f, 4.69f)
                curveTo(10.8f, 4.29f, 10.44f, 4f, 10f, 4f)
                verticalLineTo(2f)
                curveTo(11.54f, 2f, 12.79f, 3.16f, 12.97f, 4.65f)
                curveTo(13.91f, 4.94f, 14.72f, 5.66f, 15.27f, 6.63f)
                lineTo(13.75f, 7.5f)
                lineTo(12f, 6.5f)
                lineTo(10.25f, 7.5f)
                moveTo(16f, 10f)
                verticalLineTo(22f)
                curveTo(16f, 22f, 8f, 20f, 8f, 11f)
                verticalLineTo(10f)
                curveTo(8f, 9.27f, 8.4f, 8.63f, 9f, 8.28f)
                lineTo(10.25f, 9f)
                lineTo(12f, 8f)
                lineTo(13.75f, 9f)
                lineTo(15f, 8.28f)
                curveTo(15.6f, 8.63f, 16f, 9.27f, 16f, 10f)
                moveTo(14f, 11.45f)
                lineTo(12f, 10.3f)
                lineTo(10f, 11.43f)
                curveTo(10.17f, 15.44f, 12.23f, 17.69f, 14f, 18.87f)
                verticalLineTo(11.45f)
                close()
            }
        }.build()

        return _ChiliMildOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ChiliMildOutline: ImageVector? = null

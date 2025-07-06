package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldAirplaneOutline: ImageVector
    get() {
        if (_ShieldAirplaneOutline != null) {
            return _ShieldAirplaneOutline!!
        }
        _ShieldAirplaneOutline = ImageVector.Builder(
            name = "ShieldAirplaneOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11f)
                curveTo(21f, 16.55f, 17.16f, 21.74f, 12f, 23f)
                curveTo(6.84f, 21.74f, 3f, 16.55f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(21f, 5f)
                verticalLineTo(11f)
                moveTo(12f, 21f)
                curveTo(15.75f, 20f, 19f, 15.54f, 19f, 11.22f)
                verticalLineTo(6.3f)
                lineTo(12f, 3.18f)
                lineTo(5f, 6.3f)
                verticalLineTo(11.22f)
                curveTo(5f, 15.54f, 8.25f, 20f, 12f, 21f)
                moveTo(12f, 5.68f)
                curveTo(12.5f, 5.68f, 12.95f, 6.11f, 12.95f, 6.63f)
                verticalLineTo(10.11f)
                lineTo(18f, 13.26f)
                verticalLineTo(14.53f)
                lineTo(12.95f, 12.95f)
                verticalLineTo(16.42f)
                lineTo(14.21f, 17.37f)
                verticalLineTo(18.32f)
                lineTo(12f, 17.68f)
                lineTo(9.79f, 18.32f)
                verticalLineTo(17.37f)
                lineTo(11.05f, 16.42f)
                verticalLineTo(12.95f)
                lineTo(6f, 14.53f)
                verticalLineTo(13.26f)
                lineTo(11.05f, 10.11f)
                verticalLineTo(6.63f)
                curveTo(11.05f, 6.11f, 11.5f, 5.68f, 12f, 5.68f)
                close()
            }
        }.build()

        return _ShieldAirplaneOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldAirplaneOutline: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PowerSleep: ImageVector
    get() {
        if (_PowerSleep != null) {
            return _PowerSleep!!
        }
        _PowerSleep = ImageVector.Builder(
            name = "PowerSleep",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.73f, 18f)
                curveTo(15.4f, 21.69f, 9.71f, 22f, 6f, 18.64f)
                curveTo(2.33f, 15.31f, 2.04f, 9.62f, 5.37f, 5.93f)
                curveTo(6.9f, 4.25f, 9f, 3.2f, 11.27f, 3f)
                curveTo(7.96f, 6.7f, 8.27f, 12.39f, 12f, 15.71f)
                curveTo(13.63f, 17.19f, 15.78f, 18f, 18f, 18f)
                curveTo(18.25f, 18f, 18.5f, 18f, 18.73f, 18f)
                close()
            }
        }.build()

        return _PowerSleep!!
    }

@Suppress("ObjectPropertyName")
private var _PowerSleep: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Fencing: ImageVector
    get() {
        if (_Fencing != null) {
            return _Fencing!!
        }
        _Fencing = ImageVector.Builder(
            name = "Fencing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 17.42f)
                lineTo(5.58f, 18.5f)
                lineTo(3.28f, 20.78f)
                curveTo(3f, 21.07f, 2.5f, 21.07f, 2.22f, 20.78f)
                reflectiveCurveTo(1.93f, 20f, 2.22f, 19.72f)
                lineTo(4.5f, 17.42f)
                moveTo(18.29f, 5.42f)
                lineTo(18.29f, 4f)
                lineTo(12f, 10.29f)
                lineTo(5.71f, 4f)
                lineTo(5.71f, 5.42f)
                lineTo(11.29f, 11f)
                lineTo(7.5f, 14.81f)
                curveTo(6.32f, 13.97f, 4.68f, 14.07f, 3.63f, 15.12f)
                lineTo(7.88f, 19.37f)
                curveTo(8.93f, 18.32f, 9.03f, 16.68f, 8.2f, 15.5f)
                lineTo(18.29f, 5.42f)
                moveTo(21.78f, 19.72f)
                lineTo(19.5f, 17.42f)
                lineTo(18.42f, 18.5f)
                lineTo(20.72f, 20.78f)
                curveTo(21f, 21.07f, 21.5f, 21.07f, 21.78f, 20.78f)
                reflectiveCurveTo(22.07f, 20f, 21.78f, 19.72f)
                moveTo(16.5f, 14.81f)
                lineTo(13.42f, 11.71f)
                lineTo(12.71f, 12.42f)
                lineTo(15.81f, 15.5f)
                curveTo(14.97f, 16.68f, 15.07f, 18.32f, 16.12f, 19.37f)
                lineTo(20.37f, 15.12f)
                curveTo(19.32f, 14.07f, 17.68f, 13.97f, 16.5f, 14.81f)
                close()
            }
        }.build()

        return _Fencing!!
    }

@Suppress("ObjectPropertyName")
private var _Fencing: ImageVector? = null

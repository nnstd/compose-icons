package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Football: ImageVector
    get() {
        if (_Football != null) {
            return _Football!!
        }
        _Football = ImageVector.Builder(
            name = "Football",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.39f, 21f)
                lineTo(3f, 15.61f)
                curveTo(3f, 16.7f, 3.04f, 17.71f, 3.2f, 18.63f)
                curveTo(3.35f, 19.55f, 3.5f, 20.1f, 3.71f, 20.29f)
                curveTo(3.9f, 20.5f, 4.44f, 20.65f, 5.35f, 20.81f)
                reflectiveCurveTo(7.27f, 21f, 8.39f, 21f)
                moveTo(15.5f, 9.89f)
                lineTo(9.89f, 15.5f)
                lineTo(8.5f, 14.11f)
                lineTo(14.11f, 8.5f)
                lineTo(15.5f, 9.89f)
                moveTo(3.29f, 13.08f)
                lineTo(10.92f, 20.71f)
                curveTo(13.7f, 20.21f, 15.9f, 19.15f, 17.53f, 17.53f)
                curveTo(19.15f, 15.9f, 20.21f, 13.7f, 20.71f, 10.92f)
                lineTo(13.08f, 3.29f)
                curveTo(10.3f, 3.79f, 8.1f, 4.85f, 6.47f, 6.47f)
                reflectiveCurveTo(3.79f, 10.3f, 3.29f, 13.08f)
                moveTo(15.61f, 3f)
                lineTo(21f, 8.39f)
                curveTo(21f, 7.3f, 20.96f, 6.29f, 20.81f, 5.37f)
                curveTo(20.65f, 4.45f, 20.5f, 3.9f, 20.29f, 3.71f)
                curveTo(20.1f, 3.5f, 19.56f, 3.35f, 18.65f, 3.2f)
                reflectiveCurveTo(16.73f, 3f, 15.61f, 3f)
                close()
            }
        }.build()

        return _Football!!
    }

@Suppress("ObjectPropertyName")
private var _Football: ImageVector? = null

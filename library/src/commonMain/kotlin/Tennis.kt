package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Tennis: ImageVector
    get() {
        if (_Tennis != null) {
            return _Tennis!!
        }
        _Tennis = ImageVector.Builder(
            name = "Tennis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 15f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 19f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 23f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 19f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 15f)
                moveTo(18f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 17f)
                moveTo(6.05f, 14.54f)
                curveTo(6.05f, 14.54f, 7.46f, 13.12f, 7.47f, 10.3f)
                curveTo(7.11f, 8.11f, 7.97f, 5.54f, 9.94f, 3.58f)
                curveTo(12.87f, 0.65f, 17.14f, 0.17f, 19.5f, 2.5f)
                curveTo(21.83f, 4.86f, 21.35f, 9.13f, 18.42f, 12.06f)
                curveTo(16.46f, 14.03f, 13.89f, 14.89f, 11.7f, 14.53f)
                curveTo(8.88f, 14.54f, 7.46f, 15.95f, 7.46f, 15.95f)
                lineTo(3.22f, 20.19f)
                lineTo(1.81f, 18.78f)
                lineTo(6.05f, 14.54f)
                moveTo(18.07f, 3.93f)
                curveTo(16.5f, 2.37f, 13.5f, 2.84f, 11.35f, 5f)
                curveTo(9.21f, 7.14f, 8.73f, 10.15f, 10.29f, 11.71f)
                curveTo(11.86f, 13.27f, 14.86f, 12.79f, 17f, 10.65f)
                curveTo(19.16f, 8.5f, 19.63f, 5.5f, 18.07f, 3.93f)
                close()
            }
        }.build()

        return _Tennis!!
    }

@Suppress("ObjectPropertyName")
private var _Tennis: ImageVector? = null

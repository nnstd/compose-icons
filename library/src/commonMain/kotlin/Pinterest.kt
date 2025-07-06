package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pinterest: ImageVector
    get() {
        if (_Pinterest != null) {
            return _Pinterest!!
        }
        _Pinterest = ImageVector.Builder(
            name = "Pinterest",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.04f, 21.54f)
                curveTo(10f, 21.83f, 10.97f, 22f, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                curveTo(2f, 16.25f, 4.67f, 19.9f, 8.44f, 21.34f)
                curveTo(8.35f, 20.56f, 8.26f, 19.27f, 8.44f, 18.38f)
                lineTo(9.59f, 13.44f)
                curveTo(9.59f, 13.44f, 9.3f, 12.86f, 9.3f, 11.94f)
                curveTo(9.3f, 10.56f, 10.16f, 9.53f, 11.14f, 9.53f)
                curveTo(12f, 9.53f, 12.4f, 10.16f, 12.4f, 10.97f)
                curveTo(12.4f, 11.83f, 11.83f, 13.06f, 11.54f, 14.24f)
                curveTo(11.37f, 15.22f, 12.06f, 16.08f, 13.06f, 16.08f)
                curveTo(14.84f, 16.08f, 16.22f, 14.18f, 16.22f, 11.5f)
                curveTo(16.22f, 9.1f, 14.5f, 7.46f, 12.03f, 7.46f)
                curveTo(9.21f, 7.46f, 7.55f, 9.56f, 7.55f, 11.77f)
                curveTo(7.55f, 12.63f, 7.83f, 13.5f, 8.29f, 14.07f)
                curveTo(8.38f, 14.13f, 8.38f, 14.21f, 8.35f, 14.36f)
                lineTo(8.06f, 15.45f)
                curveTo(8.06f, 15.62f, 7.95f, 15.68f, 7.78f, 15.56f)
                curveTo(6.5f, 15f, 5.76f, 13.18f, 5.76f, 11.71f)
                curveTo(5.76f, 8.55f, 8f, 5.68f, 12.32f, 5.68f)
                curveTo(15.76f, 5.68f, 18.44f, 8.15f, 18.44f, 11.43f)
                curveTo(18.44f, 14.87f, 16.31f, 17.63f, 13.26f, 17.63f)
                curveTo(12.29f, 17.63f, 11.34f, 17.11f, 11f, 16.5f)
                lineTo(10.33f, 18.87f)
                curveTo(10.1f, 19.73f, 9.47f, 20.88f, 9.04f, 21.57f)
                verticalLineTo(21.54f)
                close()
            }
        }.build()

        return _Pinterest!!
    }

@Suppress("ObjectPropertyName")
private var _Pinterest: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Fan: ImageVector
    get() {
        if (_Fan != null) {
            return _Fan!!
        }
        _Fan = ImageVector.Builder(
            name = "Fan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 11f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11f)
                moveTo(12.5f, 2f)
                curveTo(17f, 2f, 17.11f, 5.57f, 14.75f, 6.75f)
                curveTo(13.76f, 7.24f, 13.32f, 8.29f, 13.13f, 9.22f)
                curveTo(13.61f, 9.42f, 14.03f, 9.73f, 14.35f, 10.13f)
                curveTo(18.05f, 8.13f, 22.03f, 8.92f, 22.03f, 12.5f)
                curveTo(22.03f, 17f, 18.46f, 17.1f, 17.28f, 14.73f)
                curveTo(16.78f, 13.74f, 15.72f, 13.3f, 14.79f, 13.11f)
                curveTo(14.59f, 13.59f, 14.28f, 14f, 13.88f, 14.34f)
                curveTo(15.87f, 18.03f, 15.08f, 22f, 11.5f, 22f)
                curveTo(7f, 22f, 6.91f, 18.42f, 9.27f, 17.24f)
                curveTo(10.25f, 16.75f, 10.69f, 15.71f, 10.89f, 14.79f)
                curveTo(10.4f, 14.59f, 9.97f, 14.27f, 9.65f, 13.87f)
                curveTo(5.96f, 15.85f, 2f, 15.07f, 2f, 11.5f)
                curveTo(2f, 7f, 5.56f, 6.89f, 6.74f, 9.26f)
                curveTo(7.24f, 10.25f, 8.29f, 10.68f, 9.22f, 10.87f)
                curveTo(9.41f, 10.39f, 9.73f, 9.97f, 10.14f, 9.65f)
                curveTo(8.15f, 5.96f, 8.94f, 2f, 12.5f, 2f)
                close()
            }
        }.build()

        return _Fan!!
    }

@Suppress("ObjectPropertyName")
private var _Fan: ImageVector? = null

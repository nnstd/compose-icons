package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Dog: ImageVector
    get() {
        if (_Dog != null) {
            return _Dog!!
        }
        _Dog = ImageVector.Builder(
            name = "Dog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 4f)
                curveTo(16.29f, 4f, 15.25f, 4.33f, 14.65f, 4.61f)
                curveTo(13.88f, 4.23f, 13f, 4f, 12f, 4f)
                curveTo(11f, 4f, 10.12f, 4.23f, 9.35f, 4.61f)
                curveTo(8.75f, 4.33f, 7.71f, 4f, 6f, 4f)
                curveTo(3f, 4f, 1f, 12f, 1f, 14f)
                curveTo(1f, 14.83f, 2.32f, 15.59f, 4.14f, 15.9f)
                curveTo(4.78f, 18.14f, 7.8f, 19.85f, 11.5f, 20f)
                verticalLineTo(15.72f)
                curveTo(10.91f, 15.35f, 10f, 14.68f, 10f, 14f)
                curveTo(10f, 13f, 12f, 13f, 12f, 13f)
                curveTo(12f, 13f, 14f, 13f, 14f, 14f)
                curveTo(14f, 14.68f, 13.09f, 15.35f, 12.5f, 15.72f)
                verticalLineTo(20f)
                curveTo(16.2f, 19.85f, 19.22f, 18.14f, 19.86f, 15.9f)
                curveTo(21.68f, 15.59f, 23f, 14.83f, 23f, 14f)
                curveTo(23f, 12f, 21f, 4f, 18f, 4f)
                moveTo(4.15f, 13.87f)
                curveTo(3.65f, 13.75f, 3.26f, 13.61f, 3f, 13.5f)
                curveTo(3.25f, 10.73f, 5.2f, 6.4f, 6.05f, 6f)
                curveTo(6.59f, 6f, 7f, 6.06f, 7.37f, 6.11f)
                curveTo(5.27f, 8.42f, 4.44f, 12.04f, 4.15f, 13.87f)
                moveTo(9f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 11f)
                curveTo(8f, 10.46f, 8.45f, 10f, 9f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11f)
                curveTo(10f, 11.56f, 9.55f, 12f, 9f, 12f)
                moveTo(15f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 11f)
                curveTo(14f, 10.46f, 14.45f, 10f, 15f, 10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 11f)
                curveTo(16f, 11.56f, 15.55f, 12f, 15f, 12f)
                moveTo(19.85f, 13.87f)
                curveTo(19.56f, 12.04f, 18.73f, 8.42f, 16.63f, 6.11f)
                curveTo(17f, 6.06f, 17.41f, 6f, 17.95f, 6f)
                curveTo(18.8f, 6.4f, 20.75f, 10.73f, 21f, 13.5f)
                curveTo(20.75f, 13.61f, 20.36f, 13.75f, 19.85f, 13.87f)
                close()
            }
        }.build()

        return _Dog!!
    }

@Suppress("ObjectPropertyName")
private var _Dog: ImageVector? = null

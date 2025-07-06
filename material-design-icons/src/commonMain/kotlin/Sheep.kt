package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sheep: ImageVector
    get() {
        if (_Sheep != null) {
            return _Sheep!!
        }
        _Sheep = ImageVector.Builder(
            name = "Sheep",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 11f)
                curveTo(16.42f, 11f, 15.5f, 10.31f, 15.16f, 9.36f)
                curveTo(14.72f, 9.75f, 14.14f, 10f, 13.5f, 10f)
                curveTo(12.94f, 10f, 12.42f, 9.81f, 12f, 9.5f)
                curveTo(11.58f, 9.81f, 11.07f, 10f, 10.5f, 10f)
                curveTo(9.86f, 10f, 9.28f, 9.75f, 8.84f, 9.36f)
                curveTo(8.5f, 10.31f, 7.58f, 11f, 6.5f, 11f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 8.5f)
                curveTo(4f, 7.26f, 4.91f, 6.23f, 6.1f, 6.04f)
                curveTo(6.04f, 5.87f, 6f, 5.69f, 6f, 5.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 4f)
                curveTo(7.7f, 4f, 7.89f, 4.04f, 8.06f, 4.11f)
                curveTo(8.23f, 3.47f, 8.81f, 3f, 9.5f, 3f)
                curveTo(9.75f, 3f, 10f, 3.07f, 10.18f, 3.17f)
                curveTo(10.5f, 2.5f, 11.19f, 2f, 12f, 2f)
                curveTo(12.81f, 2f, 13.5f, 2.5f, 13.82f, 3.17f)
                curveTo(14f, 3.07f, 14.25f, 3f, 14.5f, 3f)
                curveTo(15.19f, 3f, 15.77f, 3.47f, 15.94f, 4.11f)
                curveTo(16.11f, 4.04f, 16.3f, 4f, 16.5f, 4f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 5.5f)
                curveTo(18f, 5.69f, 17.96f, 5.87f, 17.9f, 6.04f)
                curveTo(19.09f, 6.23f, 20f, 7.26f, 20f, 8.5f)
                moveTo(10f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                moveTo(14f, 12f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 12f)
                moveTo(20.23f, 10.66f)
                curveTo(19.59f, 11.47f, 18.61f, 12f, 17.5f, 12f)
                curveTo(17.05f, 12f, 16.62f, 11.9f, 16.21f, 11.73f)
                curveTo(16.2f, 14.28f, 15.83f, 17.36f, 14.45f, 18.95f)
                curveTo(13.93f, 19.54f, 13.3f, 19.86f, 12.5f, 19.96f)
                verticalLineTo(18f)
                horizontalLineTo(11.5f)
                verticalLineTo(19.96f)
                curveTo(10.7f, 19.86f, 10.07f, 19.55f, 9.55f, 18.95f)
                curveTo(8.16f, 17.35f, 7.79f, 14.29f, 7.78f, 11.74f)
                curveTo(7.38f, 11.9f, 6.95f, 12f, 6.5f, 12f)
                curveTo(5.39f, 12f, 4.41f, 11.47f, 3.77f, 10.66f)
                curveTo(2.88f, 11.55f, 2f, 12f, 2f, 12f)
                curveTo(2f, 12f, 3f, 14f, 5f, 14f)
                curveTo(5.36f, 14f, 5.64f, 13.96f, 5.88f, 13.91f)
                curveTo(6.22f, 17.73f, 7.58f, 22f, 12f, 22f)
                curveTo(16.42f, 22f, 17.78f, 17.73f, 18.12f, 13.91f)
                curveTo(18.36f, 13.96f, 18.64f, 14f, 19f, 14f)
                curveTo(21f, 14f, 22f, 12f, 22f, 12f)
                curveTo(22f, 12f, 21.12f, 11.55f, 20.23f, 10.66f)
                close()
            }
        }.build()

        return _Sheep!!
    }

@Suppress("ObjectPropertyName")
private var _Sheep: ImageVector? = null

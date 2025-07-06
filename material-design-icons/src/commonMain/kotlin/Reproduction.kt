package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Reproduction: ImageVector
    get() {
        if (_Reproduction != null) {
            return _Reproduction!!
        }
        _Reproduction = ImageVector.Builder(
            name = "Reproduction",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.72f, 13.15f)
                lineTo(13.62f, 12.26f)
                curveTo(13.6f, 11f, 14.31f, 9.44f, 15.62f, 8.14f)
                curveTo(17.57f, 6.18f, 20.11f, 5.55f, 21.28f, 6.72f)
                curveTo(22.45f, 7.89f, 21.82f, 10.43f, 19.86f, 12.38f)
                curveTo(18.56f, 13.69f, 17f, 14.4f, 15.74f, 14.38f)
                lineTo(14.85f, 15.28f)
                curveTo(14.5f, 15.61f, 14f, 15.66f, 13.6f, 15.41f)
                curveTo(12.76f, 15.71f, 12f, 16.08f, 11.56f, 16.8f)
                curveTo(11.03f, 17.68f, 11.03f, 19.1f, 10.47f, 19.95f)
                curveTo(9.91f, 20.81f, 8.79f, 21.1f, 7.61f, 21.1f)
                curveTo(6.43f, 21.1f, 5f, 21f, 3.95f, 19.5f)
                lineTo(6.43f, 19.92f)
                curveTo(7f, 20f, 8.5f, 19.39f, 9.05f, 18.54f)
                curveTo(9.61f, 17.68f, 9.61f, 16.27f, 10.14f, 15.38f)
                curveTo(10.61f, 14.6f, 11.5f, 14.23f, 12.43f, 13.91f)
                curveTo(12.42f, 13.64f, 12.5f, 13.36f, 12.72f, 13.15f)
                moveTo(7f, 2f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 12f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 7f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2f)
                moveTo(7f, 4f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 10f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 7f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 4f)
                close()
            }
        }.build()

        return _Reproduction!!
    }

@Suppress("ObjectPropertyName")
private var _Reproduction: ImageVector? = null

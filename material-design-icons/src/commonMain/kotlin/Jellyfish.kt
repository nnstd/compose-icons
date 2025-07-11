package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Jellyfish: ImageVector
    get() {
        if (_Jellyfish != null) {
            return _Jellyfish!!
        }
        _Jellyfish = ImageVector.Builder(
            name = "Jellyfish",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 14.5f)
                curveTo(18.92f, 14.43f, 18.43f, 14.92f, 18.5f, 15.5f)
                curveTo(18.5f, 16.17f, 17.5f, 16.17f, 17.5f, 15.5f)
                verticalLineTo(13.2f)
                lineTo(19.2f, 12.7f)
                curveTo(19.92f, 12.36f, 20.41f, 11.68f, 20.5f, 10.9f)
                curveTo(20.5f, 5.5f, 16.7f, 2f, 12f, 2f)
                curveTo(7.3f, 2f, 3.5f, 5.5f, 3.5f, 10.9f)
                curveTo(3.56f, 11.7f, 4.06f, 12.4f, 4.8f, 12.7f)
                lineTo(6.5f, 13.2f)
                verticalLineTo(15.5f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 16f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 15.5f)
                curveTo(5.57f, 14.92f, 5.08f, 14.43f, 4.5f, 14.5f)
                curveTo(3.92f, 14.43f, 3.43f, 14.92f, 3.5f, 15.5f)
                curveTo(3.44f, 16.91f, 4.59f, 18.06f, 6f, 18f)
                curveTo(7.41f, 18.06f, 8.56f, 16.91f, 8.5f, 15.5f)
                verticalLineTo(13.7f)
                horizontalLineTo(9.5f)
                verticalLineTo(19.4f)
                curveTo(9.5f, 20.07f, 8.5f, 20.07f, 8.5f, 19.4f)
                curveTo(8.57f, 18.82f, 8.08f, 18.33f, 7.5f, 18.4f)
                curveTo(6.92f, 18.33f, 6.43f, 18.82f, 6.5f, 19.4f)
                curveTo(6.38f, 20.84f, 7.55f, 22.07f, 9f, 22f)
                curveTo(10.41f, 22.06f, 11.56f, 20.91f, 11.5f, 19.5f)
                verticalLineTo(14f)
                horizontalLineTo(12.5f)
                verticalLineTo(19.5f)
                curveTo(12.44f, 20.91f, 13.59f, 22.06f, 15f, 22f)
                curveTo(16.41f, 22.06f, 17.56f, 20.91f, 17.5f, 19.5f)
                curveTo(17.5f, 18.17f, 15.5f, 18.17f, 15.5f, 19.5f)
                curveTo(15.5f, 20.17f, 14.5f, 20.17f, 14.5f, 19.5f)
                verticalLineTo(13.8f)
                horizontalLineTo(15.5f)
                verticalLineTo(15.6f)
                curveTo(15.5f, 16.96f, 16.63f, 18.06f, 18f, 18f)
                curveTo(19.41f, 18.06f, 20.56f, 16.91f, 20.5f, 15.5f)
                curveTo(20.57f, 14.92f, 20.08f, 14.43f, 19.5f, 14.5f)
                moveTo(10.6f, 4.7f)
                curveTo(9.09f, 5.03f, 7.79f, 5.97f, 7f, 7.3f)
                curveTo(6.83f, 7.5f, 6.5f, 7.57f, 6.3f, 7.4f)
                curveTo(6.08f, 7.23f, 6.04f, 6.92f, 6.2f, 6.7f)
                curveTo(7.16f, 5.19f, 8.67f, 4.12f, 10.4f, 3.7f)
                curveTo(10.67f, 3.68f, 10.91f, 3.85f, 11f, 4.1f)
                curveTo(11.06f, 4.37f, 10.88f, 4.65f, 10.6f, 4.7f)
                close()
            }
        }.build()

        return _Jellyfish!!
    }

@Suppress("ObjectPropertyName")
private var _Jellyfish: ImageVector? = null

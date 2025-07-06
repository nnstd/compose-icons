package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Snowman: ImageVector
    get() {
        if (_Snowman != null) {
            return _Snowman!!
        }
        _Snowman = ImageVector.Builder(
            name = "Snowman",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 17f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 17f)
                curveTo(7f, 15.5f, 7.65f, 14.17f, 8.69f, 13.25f)
                curveTo(8.26f, 12.61f, 8f, 11.83f, 8f, 11f)
                curveTo(8f, 10.86f, 8f, 10.73f, 8f, 10.59f)
                lineTo(5.04f, 8.87f)
                lineTo(4.83f, 8.71f)
                lineTo(2.29f, 9.39f)
                lineTo(2.03f, 8.43f)
                lineTo(4.24f, 7.84f)
                lineTo(2.26f, 6.69f)
                lineTo(2.76f, 5.82f)
                lineTo(4.74f, 6.97f)
                lineTo(4.15f, 4.75f)
                lineTo(5.11f, 4.5f)
                lineTo(5.8f, 7.04f)
                lineTo(6.04f, 7.14f)
                lineTo(8.73f, 8.69f)
                curveTo(9.11f, 8.15f, 9.62f, 7.71f, 10.22f, 7.42f)
                curveTo(9.5f, 6.87f, 9f, 6f, 9f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5f)
                curveTo(15f, 6f, 14.5f, 6.87f, 13.78f, 7.42f)
                curveTo(14.38f, 7.71f, 14.89f, 8.15f, 15.27f, 8.69f)
                lineTo(17.96f, 7.14f)
                lineTo(18.2f, 7.04f)
                lineTo(18.89f, 4.5f)
                lineTo(19.85f, 4.75f)
                lineTo(19.26f, 6.97f)
                lineTo(21.24f, 5.82f)
                lineTo(21.74f, 6.69f)
                lineTo(19.76f, 7.84f)
                lineTo(21.97f, 8.43f)
                lineTo(21.71f, 9.39f)
                lineTo(19.17f, 8.71f)
                lineTo(18.96f, 8.87f)
                lineTo(16f, 10.59f)
                verticalLineTo(11f)
                curveTo(16f, 11.83f, 15.74f, 12.61f, 15.31f, 13.25f)
                curveTo(16.35f, 14.17f, 17f, 15.5f, 17f, 17f)
                close()
            }
        }.build()

        return _Snowman!!
    }

@Suppress("ObjectPropertyName")
private var _Snowman: ImageVector? = null

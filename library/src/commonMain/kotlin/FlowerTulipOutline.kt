package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlowerTulipOutline: ImageVector
    get() {
        if (_FlowerTulipOutline != null) {
            return _FlowerTulipOutline!!
        }
        _FlowerTulipOutline = ImageVector.Builder(
            name = "FlowerTulipOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 13f)
                moveTo(5.44f, 15.44f)
                curveTo(7.35f, 16.15f, 8.85f, 17.65f, 9.56f, 19.56f)
                curveTo(7.65f, 18.85f, 6.15f, 17.35f, 5.44f, 15.44f)
                moveTo(12f, 22f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 13f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                moveTo(14.42f, 19.57f)
                curveTo(15.11f, 17.64f, 16.64f, 16.11f, 18.57f, 15.42f)
                curveTo(17.86f, 17.34f, 16.34f, 18.86f, 14.42f, 19.57f)
                moveTo(12f, 14f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 8f)
                verticalLineTo(3f)
                curveTo(17.26f, 3f, 16.53f, 3.12f, 15.84f, 3.39f)
                curveTo(15.29f, 3.62f, 14.8f, 3.96f, 14.39f, 4.39f)
                lineTo(12f, 2f)
                lineTo(9.61f, 4.39f)
                curveTo(9.2f, 3.96f, 8.71f, 3.62f, 8.16f, 3.39f)
                curveTo(7.47f, 3.12f, 6.74f, 3f, 6f, 3f)
                verticalLineTo(8f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                moveTo(8f, 5.61f)
                lineTo(9.57f, 7.26f)
                lineTo(12f, 4.83f)
                lineTo(14.43f, 7.26f)
                lineTo(16f, 5.61f)
                verticalLineTo(8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                verticalLineTo(5.61f)
                close()
            }
        }.build()

        return _FlowerTulipOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlowerTulipOutline: ImageVector? = null

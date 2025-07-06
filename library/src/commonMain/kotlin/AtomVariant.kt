package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AtomVariant: ImageVector
    get() {
        if (_AtomVariant != null) {
            return _AtomVariant!!
        }
        _AtomVariant = ImageVector.Builder(
            name = "AtomVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.36f, 2.64f)
                curveTo(20f, 2.64f, 21.36f, 4f, 21.36f, 5.64f)
                curveTo(21.36f, 7.29f, 20f, 8.64f, 18.36f, 8.64f)
                curveTo(16.71f, 8.64f, 15.36f, 7.29f, 15.36f, 5.64f)
                curveTo(15.36f, 5.34f, 15.41f, 5.06f, 15.5f, 4.8f)
                curveTo(14.43f, 4.29f, 13.25f, 4f, 12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                lineTo(4.04f, 12.84f)
                lineTo(2.05f, 13.05f)
                lineTo(2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                curveTo(13.69f, 2f, 15.28f, 2.42f, 16.67f, 3.16f)
                curveTo(17.16f, 2.83f, 17.74f, 2.64f, 18.36f, 2.64f)
                moveTo(18.36f, 4.64f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.36f, 5.64f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.36f, 6.64f)
                curveTo(18.92f, 6.64f, 19.36f, 6.19f, 19.36f, 5.64f)
                curveTo(19.36f, 5.08f, 18.92f, 4.64f, 18.36f, 4.64f)
                moveTo(5.64f, 15.36f)
                curveTo(7.29f, 15.36f, 8.64f, 16.71f, 8.64f, 18.36f)
                curveTo(8.64f, 18.66f, 8.59f, 18.94f, 8.5f, 19.2f)
                curveTo(9.57f, 19.71f, 10.75f, 20f, 12f, 20f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                lineTo(19.96f, 11.16f)
                lineTo(21.95f, 10.95f)
                lineTo(22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                curveTo(10.31f, 22f, 8.72f, 21.58f, 7.33f, 20.84f)
                curveTo(6.84f, 21.17f, 6.26f, 21.36f, 5.64f, 21.36f)
                curveTo(4f, 21.36f, 2.64f, 20f, 2.64f, 18.36f)
                curveTo(2.64f, 16.71f, 4f, 15.36f, 5.64f, 15.36f)
                moveTo(5.64f, 17.36f)
                curveTo(5.08f, 17.36f, 4.64f, 17.81f, 4.64f, 18.36f)
                curveTo(4.64f, 18.92f, 5.08f, 19.36f, 5.64f, 19.36f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.64f, 18.36f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.64f, 17.36f)
                moveTo(12f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 12f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 8f)
                close()
            }
        }.build()

        return _AtomVariant!!
    }

@Suppress("ObjectPropertyName")
private var _AtomVariant: ImageVector? = null

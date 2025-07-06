package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Molecule: ImageVector
    get() {
        if (_Molecule != null) {
            return _Molecule!!
        }
        _Molecule = ImageVector.Builder(
            name = "Molecule",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.27f, 10f)
                lineTo(9f, 7f)
                horizontalLineTo(14.42f)
                lineTo(15.58f, 5f)
                lineTo(15.5f, 4.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 3f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 4.5f)
                curveTo(18.5f, 5.21f, 18f, 5.81f, 17.33f, 5.96f)
                lineTo(16.37f, 7.63f)
                lineTo(17.73f, 10f)
                lineTo(18.59f, 8.5f)
                lineTo(18.5f, 8f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 6.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.5f, 8f)
                curveTo(21.5f, 8.71f, 21f, 9.3f, 20.35f, 9.46f)
                lineTo(18.89f, 12f)
                lineTo(20.62f, 15f)
                curveTo(21.39f, 15.07f, 22f, 15.71f, 22f, 16.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 18f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 16.5f)
                verticalLineTo(16.24f)
                lineTo(17.73f, 14f)
                lineTo(16.37f, 16.37f)
                lineTo(17.33f, 18.04f)
                curveTo(18f, 18.19f, 18.5f, 18.79f, 18.5f, 19.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 21f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 19.5f)
                lineTo(15.58f, 19f)
                lineTo(14.42f, 17f)
                horizontalLineTo(10.58f)
                lineTo(9.42f, 19f)
                lineTo(9.5f, 19.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 21f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 19.5f)
                curveTo(6.5f, 18.79f, 7f, 18.19f, 7.67f, 18.04f)
                lineTo(8.63f, 16.37f)
                lineTo(4.38f, 9f)
                curveTo(3.61f, 8.93f, 3f, 8.29f, 3f, 7.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 6f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 7.5f)
                curveTo(6f, 7.59f, 6f, 7.68f, 6f, 7.76f)
                lineTo(7.27f, 10f)
                moveTo(10.15f, 9f)
                lineTo(8.42f, 12f)
                lineTo(10.15f, 15f)
                horizontalLineTo(14.85f)
                lineTo(16.58f, 12f)
                lineTo(14.85f, 9f)
                horizontalLineTo(10.15f)
                close()
            }
        }.build()

        return _Molecule!!
    }

@Suppress("ObjectPropertyName")
private var _Molecule: ImageVector? = null

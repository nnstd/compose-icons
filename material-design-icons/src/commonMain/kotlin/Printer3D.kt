package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Printer3D: ImageVector
    get() {
        if (_Printer3D != null) {
            return _Printer3D!!
        }
        _Printer3D = ImageVector.Builder(
            name = "Printer3D",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 6f)
                moveTo(19f, 2f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5f)
                verticalLineTo(11f)
                horizontalLineTo(18f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                verticalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 2f)
                horizontalLineTo(19f)
                moveTo(18f, 18.25f)
                curveTo(18f, 18.63f, 17.79f, 18.96f, 17.47f, 19.13f)
                lineTo(12.57f, 21.82f)
                curveTo(12.4f, 21.94f, 12.21f, 22f, 12f, 22f)
                curveTo(11.79f, 22f, 11.59f, 21.94f, 11.43f, 21.82f)
                lineTo(6.53f, 19.13f)
                curveTo(6.21f, 18.96f, 6f, 18.63f, 6f, 18.25f)
                verticalLineTo(13f)
                curveTo(6f, 12.62f, 6.21f, 12.29f, 6.53f, 12.12f)
                lineTo(11.43f, 9.68f)
                curveTo(11.59f, 9.56f, 11.79f, 9.5f, 12f, 9.5f)
                curveTo(12.21f, 9.5f, 12.4f, 9.56f, 12.57f, 9.68f)
                lineTo(17.47f, 12.12f)
                curveTo(17.79f, 12.29f, 18f, 12.62f, 18f, 13f)
                verticalLineTo(18.25f)
                moveTo(12f, 11.65f)
                lineTo(9.04f, 13f)
                lineTo(12f, 14.6f)
                lineTo(14.96f, 13f)
                lineTo(12f, 11.65f)
                moveTo(8f, 17.66f)
                lineTo(11f, 19.29f)
                verticalLineTo(16.33f)
                lineTo(8f, 14.71f)
                verticalLineTo(17.66f)
                moveTo(16f, 17.66f)
                verticalLineTo(14.71f)
                lineTo(13f, 16.33f)
                verticalLineTo(19.29f)
                lineTo(16f, 17.66f)
                close()
            }
        }.build()

        return _Printer3D!!
    }

@Suppress("ObjectPropertyName")
private var _Printer3D: ImageVector? = null

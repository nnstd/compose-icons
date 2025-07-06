package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Floppy: ImageVector
    get() {
        if (_Floppy != null) {
            return _Floppy!!
        }
        _Floppy = ImageVector.Builder(
            name = "Floppy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5.5f)
                lineTo(18.5f, 3f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 10f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 9f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                moveTo(12f, 4f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(12f)
                moveTo(7f, 12f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 13f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 12f)
                close()
            }
        }.build()

        return _Floppy!!
    }

@Suppress("ObjectPropertyName")
private var _Floppy: ImageVector? = null

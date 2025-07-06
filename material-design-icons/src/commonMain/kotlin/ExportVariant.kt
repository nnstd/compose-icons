package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ExportVariant: ImageVector
    get() {
        if (_ExportVariant != null) {
            return _ExportVariant!!
        }
        _ExportVariant = ImageVector.Builder(
            name = "ExportVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                lineTo(8f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                moveTo(18f, 23f)
                horizontalLineTo(6f)
                curveTo(4.89f, 23f, 4f, 22.1f, 4f, 21f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 7f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 9f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 23f)
                close()
            }
        }.build()

        return _ExportVariant!!
    }

@Suppress("ObjectPropertyName")
private var _ExportVariant: ImageVector? = null

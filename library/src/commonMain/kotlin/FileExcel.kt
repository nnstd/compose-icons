package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileExcel: ImageVector
    get() {
        if (_FileExcel != null) {
            return _FileExcel!!
        }
        _FileExcel = ImageVector.Builder(
            name = "FileExcel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(15.8f, 20f)
                horizontalLineTo(14f)
                lineTo(12f, 16.6f)
                lineTo(10f, 20f)
                horizontalLineTo(8.2f)
                lineTo(11.1f, 15.5f)
                lineTo(8.2f, 11f)
                horizontalLineTo(10f)
                lineTo(12f, 14.4f)
                lineTo(14f, 11f)
                horizontalLineTo(15.8f)
                lineTo(12.9f, 15.5f)
                lineTo(15.8f, 20f)
                moveTo(13f, 9f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _FileExcel!!
    }

@Suppress("ObjectPropertyName")
private var _FileExcel: ImageVector? = null

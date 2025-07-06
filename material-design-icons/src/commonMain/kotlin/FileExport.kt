package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileExport: ImageVector
    get() {
        if (_FileExport != null) {
            return _FileExport!!
        }
        _FileExport = ImageVector.Builder(
            name = "FileExport",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 22f)
                horizontalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 20f)
                verticalLineTo(8f)
                lineTo(14f, 2f)
                moveTo(13f, 3.5f)
                lineTo(18.5f, 9f)
                horizontalLineTo(13f)
                moveTo(8.93f, 12.22f)
                horizontalLineTo(16f)
                verticalLineTo(19.29f)
                lineTo(13.88f, 17.17f)
                lineTo(11.05f, 20f)
                lineTo(8.22f, 17.17f)
                lineTo(11.05f, 14.35f)
            }
        }.build()

        return _FileExport!!
    }

@Suppress("ObjectPropertyName")
private var _FileExport: ImageVector? = null

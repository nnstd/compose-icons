package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileImport: ImageVector
    get() {
        if (_FileImport != null) {
            return _FileImport!!
        }
        _FileImport = ImageVector.Builder(
            name = "FileImport",
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
                moveTo(10.05f, 11.22f)
                lineTo(12.88f, 14.05f)
                lineTo(15f, 11.93f)
                verticalLineTo(19f)
                horizontalLineTo(7.93f)
                lineTo(10.05f, 16.88f)
                lineTo(7.22f, 14.05f)
            }
        }.build()

        return _FileImport!!
    }

@Suppress("ObjectPropertyName")
private var _FileImport: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FileUploadOutline: ImageVector
    get() {
        if (_FileUploadOutline != null) {
            return _FileUploadOutline!!
        }
        _FileUploadOutline = ImageVector.Builder(
            name = "FileUploadOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 2f)
                lineTo(20f, 8f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 22f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2f)
                horizontalLineTo(14f)
                moveTo(18f, 20f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                moveTo(12f, 12f)
                lineTo(16f, 16f)
                horizontalLineTo(13.5f)
                verticalLineTo(19f)
                horizontalLineTo(10.5f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                lineTo(12f, 12f)
                close()
            }
        }.build()

        return _FileUploadOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FileUploadOutline: ImageVector? = null

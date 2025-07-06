package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderUpload: ImageVector
    get() {
        if (_FolderUpload != null) {
            return _FolderUpload!!
        }
        _FolderUpload = ImageVector.Builder(
            name = "FolderUpload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 8f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 20f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 18f)
                verticalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 6f)
                horizontalLineTo(20f)
                moveTo(10.75f, 13f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(19.25f)
                lineTo(15f, 8.75f)
            }
        }.build()

        return _FolderUpload!!
    }

@Suppress("ObjectPropertyName")
private var _FolderUpload: ImageVector? = null

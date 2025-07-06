package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderStar: ImageVector
    get() {
        if (_FolderStar != null) {
            return _FolderStar!!
        }
        _FolderStar = ImageVector.Builder(
            name = "FolderStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 6f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 6f)
                verticalLineTo(18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 20f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 18f)
                verticalLineTo(8f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 6f)
                moveTo(17.94f, 17f)
                lineTo(15f, 15.28f)
                lineTo(12.06f, 17f)
                lineTo(12.84f, 13.67f)
                lineTo(10.25f, 11.43f)
                lineTo(13.66f, 11.14f)
                lineTo(15f, 8f)
                lineTo(16.34f, 11.14f)
                lineTo(19.75f, 11.43f)
                lineTo(17.16f, 13.67f)
                lineTo(17.94f, 17f)
                close()
            }
        }.build()

        return _FolderStar!!
    }

@Suppress("ObjectPropertyName")
private var _FolderStar: ImageVector? = null

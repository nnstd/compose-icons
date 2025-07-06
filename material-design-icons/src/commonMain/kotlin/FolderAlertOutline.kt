package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderAlertOutline: ImageVector
    get() {
        if (_FolderAlertOutline != null) {
            return _FolderAlertOutline!!
        }
        _FolderAlertOutline = ImageVector.Builder(
            name = "FolderAlertOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                moveTo(15f, 18f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                moveTo(16f, 9f)
                curveTo(17.07f, 9f, 18.09f, 9.24f, 19f, 9.67f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                verticalLineTo(18f)
                horizontalLineTo(9.29f)
                curveTo(9.1f, 17.36f, 9f, 16.69f, 9f, 16f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 9f)
                moveTo(23f, 16f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 23f)
                curveTo(13.62f, 23f, 11.5f, 21.81f, 10.25f, 20f)
                horizontalLineTo(3f)
                curveTo(1.89f, 20f, 1f, 19.1f, 1f, 18f)
                verticalLineTo(6f)
                curveTo(1f, 4.89f, 1.89f, 4f, 3f, 4f)
                horizontalLineTo(9f)
                lineTo(11f, 6f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 8f)
                verticalLineTo(11.1f)
                curveTo(22.24f, 12.36f, 23f, 14.09f, 23f, 16f)
                moveTo(16f, 11f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 21f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 16f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 11f)
                close()
            }
        }.build()

        return _FolderAlertOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderAlertOutline: ImageVector? = null

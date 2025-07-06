package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderQuestion: ImageVector
    get() {
        if (_FolderQuestion != null) {
            return _FolderQuestion!!
        }
        _FolderQuestion = ImageVector.Builder(
            name = "FolderQuestion",
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
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
                verticalLineTo(8f)
                curveTo(22f, 6.9f, 21.1f, 6f, 20f, 6f)
                moveTo(16.8f, 18f)
                horizontalLineTo(15.3f)
                verticalLineTo(16.5f)
                horizontalLineTo(16.8f)
                verticalLineTo(18f)
                moveTo(16.8f, 15.8f)
                horizontalLineTo(15.3f)
                curveTo(15.3f, 13.4f, 17.5f, 13.5f, 17.5f, 12f)
                curveTo(17.5f, 11.2f, 16.8f, 10.5f, 16f, 10.5f)
                reflectiveCurveTo(14.5f, 11.2f, 14.5f, 12f)
                horizontalLineTo(13f)
                curveTo(13f, 10.3f, 14.3f, 9f, 16f, 9f)
                reflectiveCurveTo(19f, 10.3f, 19f, 12f)
                curveTo(19f, 13.9f, 16.8f, 14.1f, 16.8f, 15.8f)
                close()
            }
        }.build()

        return _FolderQuestion!!
    }

@Suppress("ObjectPropertyName")
private var _FolderQuestion: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FolderQuestionOutline: ImageVector
    get() {
        if (_FolderQuestionOutline != null) {
            return _FolderQuestionOutline!!
        }
        _FolderQuestionOutline = ImageVector.Builder(
            name = "FolderQuestionOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
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
                moveTo(19f, 11.7f)
                curveTo(19f, 13.4f, 17f, 13.5f, 17f, 15f)
                horizontalLineTo(15.7f)
                curveTo(15.7f, 12.8f, 17.7f, 13f, 17.7f, 11.7f)
                curveTo(17.7f, 11f, 17.1f, 10.4f, 16.4f, 10.4f)
                curveTo(15.7f, 10.4f, 15.1f, 11f, 15.1f, 11.7f)
                horizontalLineTo(13.8f)
                curveTo(13.8f, 10.2f, 15f, 9f, 16.5f, 9f)
                reflectiveCurveTo(19f, 10.2f, 19f, 11.7f)
                moveTo(17f, 15.7f)
                verticalLineTo(17f)
                horizontalLineTo(15.7f)
                verticalLineTo(15.7f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _FolderQuestionOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FolderQuestionOutline: ImageVector? = null

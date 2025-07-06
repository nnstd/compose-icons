package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NotebookCheckOutline: ImageVector
    get() {
        if (_NotebookCheckOutline != null) {
            return _NotebookCheckOutline!!
        }
        _NotebookCheckOutline = ImageVector.Builder(
            name = "NotebookCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.75f, 22.16f)
                lineTo(14f, 19.16f)
                lineTo(15.16f, 18f)
                lineTo(16.75f, 19.59f)
                lineTo(20.34f, 16f)
                lineTo(21.5f, 17.41f)
                lineTo(16.75f, 22.16f)
                moveTo(17f, 4f)
                verticalLineTo(10f)
                lineTo(15f, 8f)
                lineTo(13f, 10f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(12.08f)
                curveTo(12.2f, 20.72f, 12.45f, 21.39f, 12.8f, 22f)
                horizontalLineTo(7f)
                curveTo(5.95f, 22f, 5f, 21.05f, 5f, 20f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                curveTo(5f, 2.89f, 5.9f, 2f, 7f, 2f)
                horizontalLineTo(19f)
                curveTo(20.05f, 2f, 21f, 2.95f, 21f, 4f)
                verticalLineTo(13.8f)
                curveTo(20.39f, 13.45f, 19.72f, 13.2f, 19f, 13.08f)
                verticalLineTo(4f)
                horizontalLineTo(17f)
                moveTo(5f, 19f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                moveTo(5f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                moveTo(5f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _NotebookCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NotebookCheckOutline: ImageVector? = null

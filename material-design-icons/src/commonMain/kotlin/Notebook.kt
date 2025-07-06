package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Notebook: ImageVector
    get() {
        if (_Notebook != null) {
            return _Notebook!!
        }
        _Notebook = ImageVector.Builder(
            name = "Notebook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                curveTo(5f, 2.89f, 5.9f, 2f, 7f, 2f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                lineTo(15.5f, 7.5f)
                lineTo(18f, 9f)
                verticalLineTo(2f)
                horizontalLineTo(19f)
                curveTo(20.05f, 2f, 21f, 2.95f, 21f, 4f)
                verticalLineTo(20f)
                curveTo(21f, 21.05f, 20.05f, 22f, 19f, 22f)
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
                moveTo(7f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                moveTo(7f, 7f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                moveTo(7f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _Notebook!!
    }

@Suppress("ObjectPropertyName")
private var _Notebook: ImageVector? = null

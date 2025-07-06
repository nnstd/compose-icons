package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SelectPlace: ImageVector
    get() {
        if (_SelectPlace != null) {
            return _SelectPlace!!
        }
        _SelectPlace = ImageVector.Builder(
            name = "SelectPlace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 3f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(4f)
                curveTo(3f, 3.5f, 3.5f, 3f, 4f, 3f)
                moveTo(20f, 3f)
                curveTo(20.5f, 3f, 21f, 3.5f, 21f, 4f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(3f)
                horizontalLineTo(20f)
                moveTo(15f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(17f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                moveTo(11f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                moveTo(7f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(7f)
                moveTo(21f, 12f)
                curveTo(21f, 12.5f, 20.5f, 13f, 20f, 13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                moveTo(15f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                moveTo(11f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                moveTo(7f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                moveTo(4f, 13f)
                curveTo(3.5f, 13f, 3f, 12.5f, 3f, 12f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                moveTo(3f, 7f)
                horizontalLineTo(5f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                moveTo(21f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                moveTo(7f, 16f)
                lineTo(12f, 21f)
                lineTo(17f, 16f)
                horizontalLineTo(7f)
                close()
            }
        }.build()

        return _SelectPlace!!
    }

@Suppress("ObjectPropertyName")
private var _SelectPlace: ImageVector? = null

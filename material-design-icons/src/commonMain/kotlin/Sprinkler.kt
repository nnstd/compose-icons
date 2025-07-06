package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sprinkler: ImageVector
    get() {
        if (_Sprinkler != null) {
            return _Sprinkler!!
        }
        _Sprinkler = ImageVector.Builder(
            name = "Sprinkler",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 7f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                moveTo(5f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                verticalLineTo(22f)
                moveTo(14f, 11f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                verticalLineTo(11f)
                moveTo(17f, 10f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
                moveTo(17f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                moveTo(14f, 8f)
                horizontalLineTo(16f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                moveTo(17f, 13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                moveTo(5f, 7f)
                horizontalLineTo(5.33f)
                lineTo(6f, 9f)
                horizontalLineTo(8f)
                lineTo(8.67f, 7f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _Sprinkler!!
    }

@Suppress("ObjectPropertyName")
private var _Sprinkler: ImageVector? = null

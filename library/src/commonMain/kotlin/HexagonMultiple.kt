package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HexagonMultiple: ImageVector
    get() {
        if (_HexagonMultiple != null) {
            return _HexagonMultiple!!
        }
        _HexagonMultiple = ImageVector.Builder(
            name = "HexagonMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.25f, 2f)
                curveTo(10.44f, 2f, 10.61f, 2.11f, 10.69f, 2.26f)
                lineTo(12.91f, 6.22f)
                lineTo(13f, 6.5f)
                lineTo(12.91f, 6.78f)
                lineTo(10.69f, 10.74f)
                curveTo(10.61f, 10.89f, 10.44f, 11f, 10.25f, 11f)
                horizontalLineTo(5.75f)
                curveTo(5.56f, 11f, 5.39f, 10.89f, 5.31f, 10.74f)
                lineTo(3.09f, 6.78f)
                lineTo(3f, 6.5f)
                lineTo(3.09f, 6.22f)
                lineTo(5.31f, 2.26f)
                curveTo(5.39f, 2.11f, 5.56f, 2f, 5.75f, 2f)
                horizontalLineTo(10.25f)
                moveTo(10.25f, 13f)
                curveTo(10.44f, 13f, 10.61f, 13.11f, 10.69f, 13.26f)
                lineTo(12.91f, 17.22f)
                lineTo(13f, 17.5f)
                lineTo(12.91f, 17.78f)
                lineTo(10.69f, 21.74f)
                curveTo(10.61f, 21.89f, 10.44f, 22f, 10.25f, 22f)
                horizontalLineTo(5.75f)
                curveTo(5.56f, 22f, 5.39f, 21.89f, 5.31f, 21.74f)
                lineTo(3.09f, 17.78f)
                lineTo(3f, 17.5f)
                lineTo(3.09f, 17.22f)
                lineTo(5.31f, 13.26f)
                curveTo(5.39f, 13.11f, 5.56f, 13f, 5.75f, 13f)
                horizontalLineTo(10.25f)
                moveTo(19.5f, 7.5f)
                curveTo(19.69f, 7.5f, 19.86f, 7.61f, 19.94f, 7.76f)
                lineTo(22.16f, 11.72f)
                lineTo(22.25f, 12f)
                lineTo(22.16f, 12.28f)
                lineTo(19.94f, 16.24f)
                curveTo(19.86f, 16.39f, 19.69f, 16.5f, 19.5f, 16.5f)
                horizontalLineTo(15f)
                curveTo(14.81f, 16.5f, 14.64f, 16.39f, 14.56f, 16.24f)
                lineTo(12.34f, 12.28f)
                lineTo(12.25f, 12f)
                lineTo(12.34f, 11.72f)
                lineTo(14.56f, 7.76f)
                curveTo(14.64f, 7.61f, 14.81f, 7.5f, 15f, 7.5f)
                horizontalLineTo(19.5f)
                close()
            }
        }.build()

        return _HexagonMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _HexagonMultiple: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Lan: ImageVector
    get() {
        if (_Lan != null) {
            return _Lan!!
        }
        _Lan = ImageVector.Builder(
            name = "Lan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 2f)
                curveTo(8.89f, 2f, 8f, 2.89f, 8f, 4f)
                verticalLineTo(7f)
                curveTo(8f, 8.11f, 8.89f, 9f, 10f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(5f)
                curveTo(3.89f, 15f, 3f, 15.89f, 3f, 17f)
                verticalLineTo(20f)
                curveTo(3f, 21.11f, 3.89f, 22f, 5f, 22f)
                horizontalLineTo(9f)
                curveTo(10.11f, 22f, 11f, 21.11f, 11f, 20f)
                verticalLineTo(17f)
                curveTo(11f, 15.89f, 10.11f, 15f, 9f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                curveTo(13.89f, 15f, 13f, 15.89f, 13f, 17f)
                verticalLineTo(20f)
                curveTo(13f, 21.11f, 13.89f, 22f, 15f, 22f)
                horizontalLineTo(19f)
                curveTo(20.11f, 22f, 21f, 21.11f, 21f, 20f)
                verticalLineTo(17f)
                curveTo(21f, 15.89f, 20.11f, 15f, 19f, 15f)
                horizontalLineTo(18f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(14f)
                curveTo(15.11f, 9f, 16f, 8.11f, 16f, 7f)
                verticalLineTo(4f)
                curveTo(16f, 2.89f, 15.11f, 2f, 14f, 2f)
                horizontalLineTo(10f)
                moveTo(10f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                moveTo(5f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                moveTo(15f, 17f)
                horizontalLineTo(19f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _Lan!!
    }

@Suppress("ObjectPropertyName")
private var _Lan: ImageVector? = null

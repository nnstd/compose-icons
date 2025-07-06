package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Lectern: ImageVector
    get() {
        if (_Lectern != null) {
            return _Lectern!!
        }
        _Lectern = ImageVector.Builder(
            name = "Lectern",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 21f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                moveTo(17.5f, 6f)
                curveTo(17.5f, 4.39f, 16.41f, 3.05f, 14.93f, 2.64f)
                curveTo(14.78f, 2.27f, 14.43f, 2f, 14f, 2f)
                curveTo(13.45f, 2f, 13f, 2.45f, 13f, 3f)
                curveTo(13f, 3.55f, 13.45f, 4f, 14f, 4f)
                curveTo(14.31f, 4f, 14.58f, 3.85f, 14.76f, 3.63f)
                curveTo(15.77f, 3.95f, 16.5f, 4.89f, 16.5f, 6f)
                horizontalLineTo(4f)
                lineTo(5f, 10f)
                horizontalLineTo(19f)
                lineTo(20f, 6f)
                horizontalLineTo(17.5f)
                close()
            }
        }.build()

        return _Lectern!!
    }

@Suppress("ObjectPropertyName")
private var _Lectern: ImageVector? = null

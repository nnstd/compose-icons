package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rewind5: ImageVector
    get() {
        if (_Rewind5 != null) {
            return _Rewind5!!
        }
        _Rewind5 = ImageVector.Builder(
            name = "Rewind5",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 3f)
                curveTo(17.15f, 3f, 21.08f, 6.03f, 22.47f, 10.22f)
                lineTo(20.1f, 11f)
                curveTo(19.05f, 7.81f, 16.04f, 5.5f, 12.5f, 5.5f)
                curveTo(10.54f, 5.5f, 8.77f, 6.22f, 7.38f, 7.38f)
                lineTo(10f, 10f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                lineTo(5.6f, 5.6f)
                curveTo(7.45f, 4f, 9.85f, 3f, 12.5f, 3f)
                moveTo(9f, 12f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                curveTo(14.11f, 16f, 15f, 16.9f, 15f, 18f)
                verticalLineTo(20f)
                curveTo(15f, 21.11f, 14.11f, 22f, 13f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _Rewind5!!
    }

@Suppress("ObjectPropertyName")
private var _Rewind5: ImageVector? = null

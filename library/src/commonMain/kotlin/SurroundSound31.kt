package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SurroundSound31: ImageVector
    get() {
        if (_SurroundSound31 != null) {
            return _SurroundSound31!!
        }
        _SurroundSound31 = ImageVector.Builder(
            name = "SurroundSound31",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 17f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                moveTo(20f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                moveTo(10f, 15f)
                curveTo(10f, 16.1f, 9.1f, 17f, 8f, 17f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(8f)
                curveTo(9.1f, 7f, 10f, 7.9f, 10f, 9f)
                verticalLineTo(10.5f)
                curveTo(10f, 11.3f, 9.3f, 12f, 8.5f, 12f)
                curveTo(9.3f, 12f, 10f, 12.7f, 10f, 13.5f)
                verticalLineTo(15f)
            }
        }.build()

        return _SurroundSound31!!
    }

@Suppress("ObjectPropertyName")
private var _SurroundSound31: ImageVector? = null

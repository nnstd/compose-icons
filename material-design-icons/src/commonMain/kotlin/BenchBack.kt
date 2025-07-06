package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BenchBack: ImageVector
    get() {
        if (_BenchBack != null) {
            return _BenchBack!!
        }
        _BenchBack = ImageVector.Builder(
            name = "BenchBack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 5f)
                curveTo(3.45f, 5f, 3f, 5.45f, 3f, 6f)
                verticalLineTo(10f)
                curveTo(3f, 10.55f, 3.45f, 11f, 4f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(1f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                curveTo(20.55f, 11f, 21f, 10.55f, 21f, 10f)
                verticalLineTo(6f)
                curveTo(21f, 5.45f, 20.55f, 5f, 20f, 5f)
                horizontalLineTo(4f)
                moveTo(17f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _BenchBack!!
    }

@Suppress("ObjectPropertyName")
private var _BenchBack: ImageVector? = null

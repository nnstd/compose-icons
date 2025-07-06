package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rewind10: ImageVector
    get() {
        if (_Rewind10 != null) {
            return _Rewind10!!
        }
        _Rewind10 = ImageVector.Builder(
            name = "Rewind10",
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
                moveTo(10f, 12f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                horizontalLineTo(10f)
                moveTo(18f, 14f)
                verticalLineTo(20f)
                curveTo(18f, 21.11f, 17.11f, 22f, 16f, 22f)
                horizontalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 12f)
                horizontalLineTo(16f)
                curveTo(17.11f, 12f, 18f, 12.9f, 18f, 14f)
                moveTo(14f, 14f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _Rewind10!!
    }

@Suppress("ObjectPropertyName")
private var _Rewind10: ImageVector? = null

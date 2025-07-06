package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PipeLeak: ImageVector
    get() {
        if (_PipeLeak != null) {
            return _PipeLeak!!
        }
        _PipeLeak = ImageVector.Builder(
            name = "PipeLeak",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(10f)
                lineTo(12f, 9f)
                lineTo(10f, 7f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                moveTo(20f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(12f)
                lineTo(14f, 9f)
                lineTo(12f, 11f)
                horizontalLineTo(20f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                horizontalLineTo(20f)
                moveTo(12f, 13f)
                curveTo(12f, 13f, 10f, 15.17f, 10f, 16.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 18.5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14f, 16.5f)
                curveTo(14f, 15.17f, 12f, 13f, 12f, 13f)
                close()
            }
        }.build()

        return _PipeLeak!!
    }

@Suppress("ObjectPropertyName")
private var _PipeLeak: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CaseSensitiveAlt: ImageVector
    get() {
        if (_CaseSensitiveAlt != null) {
            return _CaseSensitiveAlt!!
        }
        _CaseSensitiveAlt = ImageVector.Builder(
            name = "CaseSensitiveAlt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 14f)
                curveTo(20f, 12.5f, 19.5f, 12f, 18f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                curveTo(16f, 10f, 16f, 10f, 14f, 10f)
                verticalLineTo(15.4f)
                lineTo(14f, 19f)
                horizontalLineTo(16f)
                lineTo(18f, 19f)
                curveTo(19.5f, 19f, 20f, 18.47f, 20f, 17f)
                verticalLineTo(14f)
                moveTo(12f, 12f)
                curveTo(12f, 10.5f, 11.47f, 10f, 10f, 10f)
                horizontalLineTo(6f)
                curveTo(4.5f, 10f, 4f, 10.5f, 4f, 12f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(12f)
                verticalLineTo(12f)
                moveTo(10f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                moveTo(22f, 9f)
                verticalLineTo(20f)
                curveTo(22f, 21.11f, 21.11f, 22f, 20f, 22f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 20f)
                verticalLineTo(9f)
                curveTo(2f, 7.89f, 2.89f, 7f, 4f, 7f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                lineTo(10f, 3f)
                horizontalLineTo(14f)
                lineTo(16f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 9f)
                horizontalLineTo(22f)
                moveTo(16f, 17f)
                horizontalLineTo(18f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                moveTo(6f, 12f)
                horizontalLineTo(10f)
                verticalLineTo(14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _CaseSensitiveAlt!!
    }

@Suppress("ObjectPropertyName")
private var _CaseSensitiveAlt: ImageVector? = null

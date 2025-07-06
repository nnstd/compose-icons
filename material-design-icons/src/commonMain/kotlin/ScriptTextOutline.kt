package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScriptTextOutline: ImageVector
    get() {
        if (_ScriptTextOutline != null) {
            return _ScriptTextOutline!!
        }
        _ScriptTextOutline = ImageVector.Builder(
            name = "ScriptTextOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 19f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 5f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 2f)
                horizontalLineTo(19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 5f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 5f)
                verticalLineTo(9f)
                lineTo(18f, 19f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 22f)
                horizontalLineTo(5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 19f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 20f)
                moveTo(9f, 6f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                moveTo(9f, 10f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                moveTo(9f, 14f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                close()
            }
        }.build()

        return _ScriptTextOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ScriptTextOutline: ImageVector? = null

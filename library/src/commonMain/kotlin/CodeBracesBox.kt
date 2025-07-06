package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CodeBracesBox: ImageVector
    get() {
        if (_CodeBracesBox != null) {
            return _CodeBracesBox!!
        }
        _CodeBracesBox = ImageVector.Builder(
            name = "CodeBracesBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(11f, 8f)
                horizontalLineTo(9f)
                verticalLineTo(10f)
                curveTo(9f, 11.1f, 8.1f, 12f, 7f, 12f)
                curveTo(8.1f, 12f, 9f, 12.9f, 9f, 14f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(9f)
                curveTo(7.9f, 18f, 7f, 17.1f, 7f, 16f)
                verticalLineTo(15f)
                curveTo(7f, 13.9f, 6.1f, 13f, 5f, 13f)
                verticalLineTo(11f)
                curveTo(6.1f, 11f, 7f, 10.1f, 7f, 9f)
                verticalLineTo(8f)
                curveTo(7f, 6.9f, 7.9f, 6f, 9f, 6f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                moveTo(19f, 13f)
                curveTo(17.9f, 13f, 17f, 13.9f, 17f, 15f)
                verticalLineTo(16f)
                curveTo(17f, 17.1f, 16.1f, 18f, 15f, 18f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                curveTo(15f, 12.9f, 15.9f, 12f, 17f, 12f)
                curveTo(15.9f, 12f, 15f, 11.1f, 15f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(6f)
                horizontalLineTo(15f)
                curveTo(16.1f, 6f, 17f, 6.9f, 17f, 8f)
                verticalLineTo(9f)
                curveTo(17f, 10.1f, 17.9f, 11f, 19f, 11f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _CodeBracesBox!!
    }

@Suppress("ObjectPropertyName")
private var _CodeBracesBox: ImageVector? = null

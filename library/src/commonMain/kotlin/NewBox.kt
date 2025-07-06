package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NewBox: ImageVector
    get() {
        if (_NewBox != null) {
            return _NewBox!!
        }
        _NewBox = ImageVector.Builder(
            name = "NewBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 4f)
                curveTo(21.11f, 4f, 22f, 4.89f, 22f, 6f)
                verticalLineTo(18f)
                curveTo(22f, 19.11f, 21.11f, 20f, 20f, 20f)
                horizontalLineTo(4f)
                curveTo(2.89f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.89f, 4f, 4f, 4f)
                horizontalLineTo(20f)
                moveTo(8.5f, 15f)
                verticalLineTo(9f)
                horizontalLineTo(7.25f)
                verticalLineTo(12.5f)
                lineTo(4.75f, 9f)
                horizontalLineTo(3.5f)
                verticalLineTo(15f)
                horizontalLineTo(4.75f)
                verticalLineTo(11.5f)
                lineTo(7.3f, 15f)
                horizontalLineTo(8.5f)
                moveTo(13.5f, 10.26f)
                verticalLineTo(9f)
                horizontalLineTo(9.5f)
                verticalLineTo(15f)
                horizontalLineTo(13.5f)
                verticalLineTo(13.75f)
                horizontalLineTo(11f)
                verticalLineTo(12.64f)
                horizontalLineTo(13.5f)
                verticalLineTo(11.38f)
                horizontalLineTo(11f)
                verticalLineTo(10.26f)
                horizontalLineTo(13.5f)
                moveTo(20.5f, 14f)
                verticalLineTo(9f)
                horizontalLineTo(19.25f)
                verticalLineTo(13.5f)
                horizontalLineTo(18.13f)
                verticalLineTo(10f)
                horizontalLineTo(16.88f)
                verticalLineTo(13.5f)
                horizontalLineTo(15.75f)
                verticalLineTo(9f)
                horizontalLineTo(14.5f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 15f)
                horizontalLineTo(19.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 14f)
                close()
            }
        }.build()

        return _NewBox!!
    }

@Suppress("ObjectPropertyName")
private var _NewBox: ImageVector? = null

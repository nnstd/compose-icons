package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ServerSecurity: ImageVector
    get() {
        if (_ServerSecurity != null) {
            return _ServerSecurity!!
        }
        _ServerSecurity = ImageVector.Builder(
            name = "ServerSecurity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 1f)
                horizontalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 2f)
                verticalLineTo(6f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 7f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 6f)
                verticalLineTo(2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 1f)
                moveTo(3f, 9f)
                horizontalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 10f)
                verticalLineTo(10.67f)
                lineTo(17.5f, 9.56f)
                lineTo(11f, 12.44f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 14f)
                verticalLineTo(10f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 9f)
                moveTo(3f, 17f)
                horizontalLineTo(11f)
                curveTo(11.06f, 19.25f, 12f, 21.4f, 13.46f, 23f)
                horizontalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 22f)
                verticalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 17f)
                moveTo(8f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                moveTo(8f, 13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                moveTo(8f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(21f)
                moveTo(4f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                moveTo(4f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                moveTo(4f, 19f)
                verticalLineTo(21f)
                horizontalLineTo(6f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                moveTo(17.5f, 12f)
                lineTo(22f, 14f)
                verticalLineTo(17f)
                curveTo(22f, 19.78f, 20.08f, 22.37f, 17.5f, 23f)
                curveTo(14.92f, 22.37f, 13f, 19.78f, 13f, 17f)
                verticalLineTo(14f)
                lineTo(17.5f, 12f)
                moveTo(17.5f, 13.94f)
                lineTo(15f, 15.06f)
                verticalLineTo(17.72f)
                curveTo(15f, 19.26f, 16.07f, 20.7f, 17.5f, 21.06f)
                verticalLineTo(13.94f)
                close()
            }
        }.build()

        return _ServerSecurity!!
    }

@Suppress("ObjectPropertyName")
private var _ServerSecurity: ImageVector? = null

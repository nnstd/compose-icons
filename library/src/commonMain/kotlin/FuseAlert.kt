package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FuseAlert: ImageVector
    get() {
        if (_FuseAlert != null) {
            return _FuseAlert!!
        }
        _FuseAlert = ImageVector.Builder(
            name = "FuseAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                moveTo(9.16f, 16f)
                verticalLineTo(12.87f)
                horizontalLineTo(7.41f)
                lineTo(9.91f, 8f)
                verticalLineTo(11.14f)
                horizontalLineTo(11.59f)
                lineTo(9.16f, 16f)
                moveTo(14f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                curveTo(5f, 1.45f, 5.45f, 1f, 6f, 1f)
                horizontalLineTo(13f)
                curveTo(13.55f, 1f, 14f, 1.45f, 14f, 2f)
                moveTo(14f, 18f)
                verticalLineTo(22f)
                curveTo(14f, 22.55f, 13.55f, 23f, 13f, 23f)
                horizontalLineTo(6f)
                curveTo(5.45f, 23f, 5f, 22.55f, 5f, 22f)
                verticalLineTo(18f)
                horizontalLineTo(14f)
                moveTo(19f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                moveTo(19f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _FuseAlert!!
    }

@Suppress("ObjectPropertyName")
private var _FuseAlert: ImageVector? = null

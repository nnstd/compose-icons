package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ssh: ImageVector
    get() {
        if (_Ssh != null) {
            return _Ssh!!
        }
        _Ssh = ImageVector.Builder(
            name = "Ssh",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.5f, 9f)
                curveTo(3.9f, 9f, 3.5f, 9.5f, 3.5f, 10f)
                verticalLineTo(11.75f)
                curveTo(3.5f, 12.25f, 3.9f, 12.75f, 4.5f, 12.75f)
                horizontalLineTo(7f)
                verticalLineTo(13.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(15f)
                horizontalLineTo(7.5f)
                curveTo(8.1f, 15f, 8.5f, 14.5f, 8.5f, 14f)
                verticalLineTo(12.25f)
                curveTo(8.5f, 11.75f, 8.1f, 11.25f, 7.5f, 11.25f)
                horizontalLineTo(5f)
                verticalLineTo(10.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(9f)
                horizontalLineTo(4.5f)
                moveTo(10.5f, 9f)
                curveTo(9.9f, 9f, 9.5f, 9.5f, 9.5f, 10f)
                verticalLineTo(11.75f)
                curveTo(9.5f, 12.25f, 9.9f, 12.75f, 10.5f, 12.75f)
                horizontalLineTo(13f)
                verticalLineTo(13.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(15f)
                horizontalLineTo(13.5f)
                curveTo(14.1f, 15f, 14.5f, 14.5f, 14.5f, 14f)
                verticalLineTo(12.25f)
                curveTo(14.5f, 11.75f, 14.1f, 11.25f, 13.5f, 11.25f)
                horizontalLineTo(11f)
                verticalLineTo(10.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(9f)
                horizontalLineTo(10.5f)
                moveTo(15.5f, 9f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                verticalLineTo(12.5f)
                horizontalLineTo(19f)
                verticalLineTo(15f)
                horizontalLineTo(20.5f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(15.5f)
                close()
            }
        }.build()

        return _Ssh!!
    }

@Suppress("ObjectPropertyName")
private var _Ssh: ImageVector? = null

package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrayAlert: ImageVector
    get() {
        if (_TrayAlert != null) {
            return _TrayAlert!!
        }
        _TrayAlert = ImageVector.Builder(
            name = "TrayAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 19f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 17f)
                moveTo(13f, 12f)
                horizontalLineTo(11f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                moveTo(13f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _TrayAlert!!
    }

@Suppress("ObjectPropertyName")
private var _TrayAlert: ImageVector? = null

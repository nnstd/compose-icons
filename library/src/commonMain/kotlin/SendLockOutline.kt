package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SendLockOutline: ImageVector
    get() {
        if (_SendLockOutline != null) {
            return _SendLockOutline!!
        }
        _SendLockOutline = ImageVector.Builder(
            name = "SendLockOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 18f)
                verticalLineTo(17.5f)
                curveTo(23f, 16.12f, 21.88f, 15f, 20.5f, 15f)
                reflectiveCurveTo(18f, 16.12f, 18f, 17.5f)
                verticalLineTo(18f)
                curveTo(17.45f, 18f, 17f, 18.45f, 17f, 19f)
                verticalLineTo(23f)
                curveTo(17f, 23.55f, 17.45f, 24f, 18f, 24f)
                horizontalLineTo(23f)
                curveTo(23.55f, 24f, 24f, 23.55f, 24f, 23f)
                verticalLineTo(19f)
                curveTo(24f, 18.45f, 23.55f, 18f, 23f, 18f)
                moveTo(22f, 18f)
                horizontalLineTo(19f)
                verticalLineTo(17.5f)
                curveTo(19f, 16.67f, 19.67f, 16f, 20.5f, 16f)
                reflectiveCurveTo(22f, 16.67f, 22f, 17.5f)
                verticalLineTo(18f)
                moveTo(4f, 6.03f)
                lineTo(11.5f, 9.25f)
                lineTo(4f, 8.25f)
                lineTo(4f, 6.03f)
                moveTo(11.5f, 14.75f)
                lineTo(4f, 17.97f)
                verticalLineTo(15.75f)
                lineTo(11.5f, 14.75f)
                moveTo(2f, 3f)
                lineTo(2f, 10f)
                lineTo(17f, 12f)
                lineTo(2f, 14f)
                lineTo(2f, 21f)
                lineTo(23f, 12f)
                lineTo(2f, 3f)
                close()
            }
        }.build()

        return _SendLockOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SendLockOutline: ImageVector? = null

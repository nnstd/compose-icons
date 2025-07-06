package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BriefcaseOffOutline: ImageVector
    get() {
        if (_BriefcaseOffOutline != null) {
            return _BriefcaseOffOutline!!
        }
        _BriefcaseOffOutline = ImageVector.Builder(
            name = "BriefcaseOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                verticalLineTo(16.8f)
                lineTo(22f, 18.8f)
                verticalLineTo(8f)
                curveTo(22f, 7.45f, 21.8f, 7f, 21.42f, 6.59f)
                curveTo(21.05f, 6.2f, 20.58f, 6f, 20f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                curveTo(16f, 3.42f, 15.8f, 2.95f, 15.42f, 2.58f)
                curveTo(15.05f, 2.2f, 14.58f, 2f, 14f, 2f)
                horizontalLineTo(10f)
                curveTo(9.42f, 2f, 8.95f, 2.2f, 8.58f, 2.58f)
                curveTo(8.2f, 2.95f, 8f, 3.42f, 8f, 4f)
                verticalLineTo(4.8f)
                lineTo(11.2f, 8f)
                horizontalLineTo(20f)
                moveTo(10f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(4.11f, 6f)
                horizontalLineTo(4f)
                curveTo(3.42f, 6f, 2.95f, 6.2f, 2.58f, 6.59f)
                curveTo(2.2f, 7f, 2f, 7.45f, 2f, 8f)
                verticalLineTo(19f)
                curveTo(2f, 19.55f, 2.2f, 20f, 2.58f, 20.41f)
                curveTo(2.95f, 20.8f, 3.42f, 21f, 4f, 21f)
                horizontalLineTo(19.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(4f, 19f)
                verticalLineTo(8f)
                horizontalLineTo(6.11f)
                lineTo(17.11f, 19f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _BriefcaseOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BriefcaseOffOutline: ImageVector? = null
